package org.example.beens;

import org.springframework.stereotype.Component;

@Component
public class Bean2 {
    private String CompanyName;
    private int raiting;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }
}
