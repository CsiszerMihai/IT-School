package session_10_oop_concepts.challenges.challenge1;

import java.util.ArrayList;
import java.util.List;

public class ProfessorManage {
    private List<Professors> professors = new ArrayList<>();

    public void addProfessor(Professors professor) {
        professors.add(professor);
    }

    public Professors getProfessor(int professorId) {
        for (Professors professor : professors) {
            if (professor.getProfessorId() == professorId) {
                return professor;
            }
        }
        return null;
    }

    public void updateProfessor(Professors updatedProfessor) {
        for (int i = 0; i < professors.size(); i++) {
            if (professors.get(i).getProfessorId() == updatedProfessor.getProfessorId()) {
                professors.set(i, updatedProfessor);
                break;
            }
        }
    }

    public void deleteProfessor(int professorId) {
        professors.removeIf(professor -> professor.getProfessorId() == professorId);
    }

    public List<Professors> getAllProfessors() {
        return new ArrayList<>(professors);
    }
}