package google.drive.domain;

import google.drive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class FileUploaded extends AbstractEvent {

    private Long Id;
    private String name;
    private Long size;
    private Date uploadedTime;
    private String type;
    private String userId;
}
