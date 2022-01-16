package com.EthioPharmacy.EthioPharmacy.models;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class Medicine {
    @NotNull
    @Size(min = 3, max = 15)
    private  final String medName;
    @Pattern(regexp = "^[$][0-9]+$")
    private  final String medPrice;
    @NotNull
    private  final String medDescription;
    private int medId;
    private static int nextMedId = 1;

    public Medicine(String medName, String medPrice, String medDescription) {
        this.medName = medName;
        this.medPrice = medPrice;
        this.medDescription = medDescription;
        medId = nextMedId;
        nextMedId++;
    }

}
