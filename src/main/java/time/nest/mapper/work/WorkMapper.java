package time.nest.mapper.work;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import time.nest.model.work.WorkCreateRequestModel;
import time.nest.model.work.WorkModel;
import time.nest.model.work.WorkUpdateRequestModel;

@Mapper
public interface WorkMapper {

  /**
   * Select work list
   *
   * @return WorkModel
   */
  List<WorkModel> getWorkList();

  /**
   * Create work
   *
   * @param request WorkCreateRequestModel
   * @return Integer
   */
  Integer createWork(@Param("request") WorkCreateRequestModel request);

  /**
   * Update work
   *
   * @param request WorkUpdateRequestModel
   * @return Integer
   */
  Integer updateWork(@Param("request") WorkUpdateRequestModel request);

  /**
   * Delete work
   *
   * @param id Integer
   * @return Integer
   */
  Integer deleteWork(@Param("id") Integer id);
}
