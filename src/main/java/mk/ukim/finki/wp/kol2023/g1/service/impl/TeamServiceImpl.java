package mk.ukim.finki.wp.kol2023.g1.service.impl;

import mk.ukim.finki.wp.kol2023.g1.model.Team;
import mk.ukim.finki.wp.kol2023.g1.model.exceptions.InvalidTeamIdException;
import mk.ukim.finki.wp.kol2023.g1.repository.TeamRepository;
import mk.ukim.finki.wp.kol2023.g1.service.TeamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public Team findById(Long id) {
        return this.teamRepository.findById(id).orElseThrow(InvalidTeamIdException::new);
    }

    @Override
    public List<Team> listAll() {
        return this.teamRepository.findAll();
    }

    @Override
    public Team create(String name) {
        Team team = new Team(name);
        return this.teamRepository.save(team);
    }
}
