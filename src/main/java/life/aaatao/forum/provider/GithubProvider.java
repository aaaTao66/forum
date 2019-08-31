package life.aaatao.forum.provider;


import com.alibaba.fastjson.JSON;
import life.aaatao.forum.dto.AccessTokenDTO;
import life.aaatao.forum.dto.GithubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class GithubProvider {

    public String getAccessToken(AccessTokenDTO accessTokenDTO) {
        MediaType mediaType = MediaType.get("application/json; charset=utf-8");

        OkHttpClient client = new OkHttpClient();

        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDTO));
        Request request = new Request.Builder()
                .url("https://github.com/login/oauth/access_token")
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            String string = response.body().string();
            String token = string.split("&")[0].split("=")[1];
            return token;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public GithubUser getUser(String accessTocken){
        OkHttpClient client = new OkHttpClient();
        String url;
        Request request = new Request.Builder()
                .url("https://api.github.com/user?access_token=" + accessTocken)
                .build();

        try {
            Response response = client.newCall(request).execute();
            String string = response.body().string();
            //自动转换成 java类 对象
            GithubUser githubUser = JSON.parseObject(string, GithubUser.class);
            return githubUser;
        } catch (IOException e) {
        }
        return null;
    }

}
