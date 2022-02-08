package nvc.it.springapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Review {
    private Integer star;
    private String comment;
}
