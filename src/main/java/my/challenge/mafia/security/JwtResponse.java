package my.challenge.mafia.security;

public class JwtResponse {
    private final String token;
    public JwtResponse(String token) {
        this.token = token;
    }
    public String getToken() {
        return this.token;
    }
}
