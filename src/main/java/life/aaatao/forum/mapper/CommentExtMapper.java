package life.aaatao.forum.mapper;

import life.aaatao.forum.domain.Comment;
import life.aaatao.forum.domain.CommentExample;
import life.aaatao.forum.domain.Question;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {

    int incCommentCount(Comment Comment);
}