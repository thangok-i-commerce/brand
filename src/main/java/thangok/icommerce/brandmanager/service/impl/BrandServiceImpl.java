package thangok.icommerce.brandmanager.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import thangok.icommerce.brandmanager.dto.BrandDTO;
import thangok.icommerce.brandmanager.service.BrandService;

import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {

    @Override
    public Page<BrandDTO> getAllBrands() {
        return null;
    }

    @Override
    public Page<BrandDTO> searchBrands(String searchText) {
        return null;
    }

    @Override
    public Optional<BrandDTO> getByCode(String brandCode) {
        return Optional.empty();
    }

    @Override
    public BrandDTO createBrand(BrandDTO newBrand) {
        return null;
    }

    @Override
    public BrandDTO updateBrand(BrandDTO newBrand) {
        return null;
    }

    @Override
    public BrandDTO deleteBrand(String brandCode) {
        return null;
    }
}
