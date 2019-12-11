package Database_Classes;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Mediaitems {
    private long mid;
    private String title;
    private long prodYear;
    private long titleLength;

    @Id
    @Column(name = "MID")
    public long getMid() {
        return mid;
    }

    public void setMid(long mid) {
        this.mid = mid;
    }

    @Basic
    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "PROD_YEAR")
    public long getProdYear() {
        return prodYear;
    }

    public void setProdYear(long prodYear) {
        this.prodYear = prodYear;
    }

    @Basic
    @Column(name = "TITLE_LENGTH")
    public long getTitleLength() {
        return titleLength;
    }

    public void setTitleLength(long titleLength) {
        this.titleLength = titleLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mediaitems that = (Mediaitems) o;
        return mid == that.mid &&
                prodYear == that.prodYear &&
                titleLength == that.titleLength &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mid, title, prodYear, titleLength);
    }
}
