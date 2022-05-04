package guru.sfg.brewery.model.events;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable {



	private static final long serialVersionUID = 8829118592572365856L;
	private BeerDto beerDto;
}