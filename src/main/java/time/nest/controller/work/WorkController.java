package time.nest.controller.work;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import time.nest.model.work.WorkCreateRequestModel;
import time.nest.model.work.WorkModel;
import time.nest.model.work.WorkUpdateRequestModel;
import time.nest.service.work.WorkService;

@RestController
@RequestMapping("/work")
public class WorkController {

  @Autowired
  private WorkService workService;

  /**
   * Work list
   *
   * @return ResponseEntity<List<WorkModel>>
   */
  @RequestMapping(value = "/list", method = RequestMethod.GET)
  public ResponseEntity<List<WorkModel>> list() {
    return ResponseEntity.ok(workService.list());
  }

  /**
   * Create work
   *
   * @param requestModel WorkUpdateRequestModel
   * @return
   */
  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public ResponseEntity<?> create(
      @RequestBody WorkCreateRequestModel requestModel) {
    return workService.create(requestModel);
  }

  /**
   * Update
   *
   * @param requestModel WorkUpdateRequestModel
   * @return
   */
  @RequestMapping(value = "/update", method = RequestMethod.POST)
  public ResponseEntity<?> update(
      @RequestBody WorkUpdateRequestModel requestModel) {
    return workService.update(requestModel);
  }

  /**
   * Delete
   *
   * @param id Integer
   * @return
   */
  @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
  public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
      return workService.delete(id);
  }
}
