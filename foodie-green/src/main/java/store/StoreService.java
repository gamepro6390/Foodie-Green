package store;

import java.util.List;

public interface StoreService {
	List<StoreDTO> getStorelist();
	StoreDTO getDetail(int id);
}
