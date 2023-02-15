package google.drive.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="Dashboard_table")
@Data
public class Dashboard {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String fileName;
        private Long fileSize;
        private Boolean isIndexed;
        private Boolean isUploaded;
        private Boolean videoUrl;


}
