package life.aaatao.forum.mapper;

import life.aaatao.forum.domain.Question;
import life.aaatao.forum.domain.QuestionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface QuestionExtMapper {

    int incView(Question record);
}