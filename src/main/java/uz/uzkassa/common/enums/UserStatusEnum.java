/*
package uz.uzkassa.common.enums;

import lombok.Getter;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;

@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum UserStatusEnum implements Serializable {
    ACTIVE("ACTIVE", "Active", "Active", "Active"),
    PENDING("PENDING", "Pending", "Pending", "Pending"),
    IN_ACTIVE("IN_ACTIVE", "In Active", "In Active", "In Active");

    private String code;
    private String nameRu;
    private String nameUzCyrillic;
    private String nameUzLatin;

    UserStatusEnum(String code) {
        this.code = code;
    }

    UserStatusEnum(String code, String nameRu, String nameUzCyrillic, String nameUzLatin) {
        this.code = code;
        this.nameRu = nameRu;
        this.nameUzCyrillic = nameUzCyrillic;
        this.nameUzLatin = nameUzLatin;
    }

    public String getCode() {
        return code;
    }

    public static UserStatusEnum get(String code) {
        if (code == null || "".equals(code)) {
            return null;
        }
        for (UserStatusEnum statusEnum : UserStatusEnum.values()) {
            if (code.equals(statusEnum.getCode())) {
                return statusEnum;
            }
        }
        return null;
    }
}
*/
