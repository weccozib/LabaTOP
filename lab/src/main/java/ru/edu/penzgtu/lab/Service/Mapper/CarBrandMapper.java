package ru.edu.penzgtu.lab.Service.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.edu.penzgtu.lab.Dto.CarBrandDto;
import ru.edu.penzgtu.lab.Entity.CarBrand;
import ru.edu.penzgtu.lab.Entity.Country;
import ru.edu.penzgtu.lab.Repo.CountryRepository;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
@Service
@RequiredArgsConstructor
public class CarBrandMapper {

    public List<CarBrandDto> toListDto(List<CarBrand> carBrands) {
        return carBrands.stream().map(this::toDto).toList();
    }

    public CarBrandDto toDto(CarBrand carBrand) {
        String countryName = carBrand.getCountry() != null ? carBrand.getCountry().getName() : null;


        return CarBrandDto.builder()
                .id(carBrand.getId())
                .name(carBrand.getName())
                .localDateTime(carBrand.getLocalDateTime())
                .founder(carBrand.getFounder())
                .yearOfFound(carBrand.getYearOfFound())
                .countryName(carBrand.getCountry().getName())
                .build();
    }
    public CarBrand toEntity(CarBrandDto carBrandDto) {
        CarBrand carBrand = new CarBrand();

        carBrand.setId(carBrandDto.getId());
        carBrand.setName(carBrandDto.getName());
        carBrand.setLocalDateTime(LocalDateTime.now());
        carBrand.setFounder(carBrandDto.getFounder());
        carBrand.setYearOfFound(carBrandDto.getYearOfFound());


        return carBrand;
    }
}
