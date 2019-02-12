package exercise;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by tubangwu on 2017/12/19.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Apple {
    private Integer weight;
    private String name;
}
