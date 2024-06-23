package com.morc.request;


import com.morc.model.ContactInformation;
import com.morc.model.addresses;
import jakarta.persistence.Embedded;
import lombok.Data;

import java.util.List;

@Data
public class RestaurantCreateRequest {
    private Long id;
    private String name;
    private String Description;
    private String cuisineType;
    private addresses address;
    private ContactInformation contactInformation;
    private String OpeningHours;
    private List<String> images;

}
