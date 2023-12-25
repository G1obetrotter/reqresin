package g1obetrotter.modeles;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserListResponseModel {
    Integer page;
    Integer per_page;
    Integer total;
    @JsonProperty("total_pages")
    Integer totalPages;
    UserDataResponseModel[] data;
    UserSupportResponseModel support;
}
