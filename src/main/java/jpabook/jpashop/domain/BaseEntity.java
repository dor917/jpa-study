package jpabook.jpashop.domain;

import javax.persistence.Entity;
import java.time.LocalDateTime;

public class BaseEntity {
    private LocalDateTime regDate;
    private String regId;
    private LocalDateTime modDate;
    private String modId;

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public LocalDateTime getModDate() {
        return modDate;
    }

    public void setModDate(LocalDateTime modDate) {
        this.modDate = modDate;
    }

    public String getModId() {
        return modId;
    }

    public void setModId(String modId) {
        this.modId = modId;
    }
}
