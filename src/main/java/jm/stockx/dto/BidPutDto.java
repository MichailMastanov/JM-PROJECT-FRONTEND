package jm.stockx.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BidPutDto {

    @NotNull
    private Long id;

    private Boolean success;

//    public BidPutDto(Bid bid) {
//        this.id = bid.getId();
//        this.success = bid.getSuccess();
//    }
}
