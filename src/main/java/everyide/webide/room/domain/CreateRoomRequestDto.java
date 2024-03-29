package everyide.webide.room.domain;

import lombok.Data;

@Data
public class CreateRoomRequestDto {
    private String name;
    private String description;
    private Boolean isLocked;
    private String password;
    private String roomType;
    private Integer maxPeople;

}