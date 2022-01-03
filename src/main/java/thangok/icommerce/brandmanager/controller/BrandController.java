package thangok.icommerce.brandmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import thangok.icommerce.brandmanager.dto.BrandDTO;
import thangok.icommerce.brandmanager.service.BrandService;

import java.util.Optional;

@RestController
@RequestMapping("/api/brand")
public class BrandController {

    @Autowired
    BrandService brandService;

    @GetMapping("/")
    public Page<BrandDTO> getAllBrands() {
        return brandService.getAllBrands();
    }

    @GetMapping("/{brandCode}")
    public Optional<BrandDTO> getByCode(@PathVariable("brandCode") String brandCode) {
        return brandService.getByCode(brandCode);
    }

    @GetMapping("/search/{searchText}")
    public Page<BrandDTO> searchBrands(@PathVariable("searchText") String searchText) {
        return brandService.searchBrands(searchText);
    }

    @PostMapping("/")
    public BrandDTO createBrand(final BrandDTO brandDTO) {
        return brandService.createBrand(brandDTO);
    }
}
