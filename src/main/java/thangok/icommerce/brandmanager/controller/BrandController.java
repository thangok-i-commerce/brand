package thangok.icommerce.brandmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import thangok.icommerce.brandmanager.dto.BrandDTO;
import thangok.icommerce.brandmanager.service.BrandService;

import java.util.Optional;

@RestController
@RequestMapping("/api/brand")
public class BrandController {

    @Autowired
    BrandService brandService;

    @GetMapping("/list")
    public Page<BrandDTO> getAllBrands() {
        return brandService.getAllBrands();
    }

    @GetMapping("/search/{searchText}")
    public Page<BrandDTO> searchBrands(@PathVariable("searchText") String searchText) {
        return brandService.searchBrands(searchText);
    }

    @GetMapping("/{brandCode}")
    public Optional<BrandDTO> getByCode(@PathVariable("brandCode") String brandCode) {
        return brandService.getByCode(brandCode);
    }
}
