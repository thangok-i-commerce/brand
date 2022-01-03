package thangok.icommerce.brandmanager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;
import thangok.icommerce.brandmanager.dto.BrandDTO;
import thangok.icommerce.brandmanager.entity.Brand;
import thangok.icommerce.brandmanager.repository.BrandRepository;
import thangok.icommerce.brandmanager.service.BrandService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    BrandRepository brandRepository;

    @Override
    public Page<BrandDTO> getAllBrands() {
        List<Brand> brandList = brandRepository.findAll();
        if (brandList.isEmpty()) {
            return null;
        }

        List<BrandDTO> result = new ArrayList<>();
        brandList.stream().map(x -> new BrandDTO() {{
            setBrandCode(x.getBrandCode());
            setBrandName(x.getBrandName());
            setDescription(x.getDescription());
        }}).forEach(result::add);

        return new PageImpl<>(result);
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
