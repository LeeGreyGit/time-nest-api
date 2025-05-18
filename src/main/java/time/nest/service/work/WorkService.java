package time.nest.service.work;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import time.nest.mapper.work.WorkMapper;
import time.nest.model.work.WorkCreateRequestModel;
import time.nest.model.work.WorkModel;
import time.nest.model.work.WorkUpdateRequestModel;

@Service
public class WorkService {
  @Autowired
  private WorkMapper workMapper;

  /**
   * Get work list
   *
   * @return List<WorkModel>
   */
  public List<WorkModel> list() {
    List<WorkModel> work = workMapper.getWorkList();
    return work;
  }

  /**
   * Create work
   *
   * @param requestModel WorkCreateRequestModel
   * @return
   */
  public ResponseEntity<?> create(WorkCreateRequestModel requestModel) {
    workMapper.createWork(requestModel);
    return new ResponseEntity<>("Success create work", HttpStatus.OK);
  }

  /**
   * Update work
   *
   * @param requestModel WorkUpdateRequestModel
   * @return
   */
  public ResponseEntity<?> update(WorkUpdateRequestModel requestModel) {
    workMapper.updateWork(requestModel);
    return new ResponseEntity<>("Success update work", HttpStatus.OK);
  }

  /**
   * Delete
   *
   * @param id Integer
   * @return
   */
  public ResponseEntity<?> delete(Integer id) {
    workMapper.deleteWork(id);
    return new ResponseEntity<>("Success delete work", HttpStatus.OK);
  }
}
