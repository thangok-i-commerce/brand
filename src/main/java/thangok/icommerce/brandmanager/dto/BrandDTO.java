package thangok.icommerce.brandmanager.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
public class BrandDTO implements Serializable {

    private String brandCode;

    private String brandName;
    private String description;

}
