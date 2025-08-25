package ru.skypro.homework.service.impl;


import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.AdsDto;
import ru.skypro.homework.dto.AdDto;
import ru.skypro.homework.dto.CreateOrUpdateAdDto;
import ru.skypro.homework.dto.ExtendedAdDto;

import java.io.IOException;

@Service
public class AdService {
    public AdsDto getAllAds() {
        return null;
    }

    public AdDto addAd(CreateOrUpdateAdDto properties, MultipartFile file) throws IOException {
        return null;
    }

    public ExtendedAdDto getAds(Integer id) {
        return null;
    }

    public void removeAd(Integer id) {
    }

    public AdDto updateDto(Integer id, CreateOrUpdateAdDto createAdsDto) {
        return null;
    }

    public AdsDto getAdsMe() {
        return null;
    }

    public void updateAdImage(Integer id, MultipartFile image) throws IOException {
    }

    public void getAdImage(Integer id) {
    }
}
