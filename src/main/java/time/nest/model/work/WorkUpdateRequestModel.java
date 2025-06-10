package time.nest.model.work;

import lombok.Data;

/**
 * Work更新リクエストモデル
 */
@Data
public class WorkUpdateRequestModel {

  private Integer workId;

  private String workName;

  private String workNote;
}
