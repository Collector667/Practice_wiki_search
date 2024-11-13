import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
class Pages{
    public String ns;
    public String title;
    public int pageid;
    public int size;
    public int wordcount;
    public String snippet;
    public String timestamp;
}
class Searchinfo {
    public int totalhits;
}
class query {
    public List<Searchinfo> searchinfo;
    public List<Pages> search;
}
class Continue {
    public String sroffset;
    @JsonSetter("continue")
    public String Continue;
}

class JsonClass {
    public String batchcomplete;
    @JsonSetter("continue")
    public List<Continue>  Continue;
    public List<query> query;
}

