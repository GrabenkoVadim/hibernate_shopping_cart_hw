package mate.academy.model;

import jakarta.persistence.*;

@Entity
@Table (name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_session_id")
    private MovieSession movieSession;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public MovieSession getMovieSession() {
        return movieSession;
    }

    public void setMovieSession(MovieSession movieSession) {
        this.movieSession = movieSession;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String
    toString() {
        return "Ticket{" +
                "id=" + id +
                ", movieSession=" + movieSession +
                ", user=" + user +
                '}';
    }
}
