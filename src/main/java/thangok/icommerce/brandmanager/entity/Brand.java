package thangok.icommerce.brandmanager.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Brand implements Serializable {

    @Id
    private String brandCode;

    private String brandName;
    private String description;

}
