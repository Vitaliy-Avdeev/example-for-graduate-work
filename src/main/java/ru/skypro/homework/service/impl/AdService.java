package ru.skypro.homework.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.Ads;
import ru.skypro.homework.dto.Ad;
import ru.skypro.homework.dto.CreateOrUpdateAd;
import ru.skypro.homework.dto.ExtendedAd;

import java.awt.*;

@Service
public class AdService {
    public Ads getAllAds() {
        return null;
    }

    public Ad addAd(CreateOrUpdateAd properties, MultipartFile image) {
        return null;
    }

    public ExtendedAd getAds(Integer id) {
        return null;
    }

    public boolean hasAdAccess(Integer id) {
        return false;
    }

    public void removeAd(Integer id) {
    }

    public Ad updateDto(Integer id, CreateOrUpdateAd createAdsDto) {
        return null;
    }

    public Ads getAdsMe() {
        return null;
    }

    public void updateAdImage(Integer id, MultipartFile image) {

    }

    public Image getAdImage(Integer id) {
        return null;
    }
}
