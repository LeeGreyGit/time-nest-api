package time.nest.model.work;

import lombok.Data;

/**
 * Work作成リクエストモデル
 */
@Data
public class WorkCreateRequestModel {

  private String workName;

  private String workNote;

}
