package mate.academy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "moviesession")
public class MovieSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private CinemaHall cinemaHall;

    private LocalDateTime showTime;

    public MovieSession() {
    }

    public MovieSession(Movie movie, CinemaHall cinemaHall, LocalDateTime showTime) {
        this.movie = movie;
        this.cinemaHall = cinemaHall;
        this.showTime = showTime;
    }

    public Long getId() {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    public LocalDateTime getShowTime() {
        return showTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    public void setShowTime(LocalDateTime showTime) {
        this.showTime = showTime;
    }

    @Override
    public String toString() {
        return "MovieSession{"
                + "id=" + id
                + ", showTime=" + showTime
                + ", movie=" + movie
                + ", cinemaHall=" + cinemaHall
                + '}';
    }
}
