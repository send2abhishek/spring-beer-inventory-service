package guru.sfg.common.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data

@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class BeerEvent implements Serializable {

    static final long serialVersionUID= 5269808352414501375L;

    private BeerDto beerDto;
}
