package futurehack.org.foodeye;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by locusf on 4/23/16.
 */
public class NDBService {
    static class SearchResult {
        public String name;
        public String ndbo;
        public String group;
        public int offset;
    }

    static class QueryRequest {
        String q;
        String max;
        String offset;

        public QueryRequest(String q) {
            this.q = q;
            this.max = "10";
            this.offset = "0";
        }
    }

    public interface NDB {
        @POST("search")
        Call<List<SearchResult>> search(@Body QueryRequest body);
    }
}