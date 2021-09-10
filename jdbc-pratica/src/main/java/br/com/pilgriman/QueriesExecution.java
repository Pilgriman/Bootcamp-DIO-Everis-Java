package br.com.pilgriman.professor;


import java.util.List;
public class QueriesExecution {
    public static void main(String[] args) {
        ProfessorDAO professorDAO = new ProfessorDAO();

// =========================== 1 - Consulta =================================================
        List<Professor> professores = professorDAO.list();

        professores.stream().forEach(System.out::println);


        // ======================= 1.1 - Consulta com filtro ========================================
       /* Professor  professorParaConsulta = professorDAO.getById(1);

        System.out.println(professorParaConsulta);*/


        // =========================== 2 - Inserção =================================================
       /* professores.stream().forEach(System.out::println);
        Professor professorParaInsercao = new Professor("Matheus", 43, "SP");

        professorDAO.create(professorParaInsercao);
        professores.stream().forEach(System.out::println);

        // =========================== 3 - Delete ===================================================
        professores.stream().forEach(System.out::println);
        professorDAO.delete(1);
        professores.stream().forEach(System.out::println);


        // =========================== 4 - Atualizar ================================================
        professores.stream().forEach(System.out::println);
        Professor professorParaAtualizar = professorDAO.getById(3);
        professorParaAtualizar.setNome("Joaquim");
        professorParaAtualizar.setIdade(18);
        professorParaAtualizar.setEstado("RS");

        professorDAO.update(professorParaAtualizar);
        professores.stream().forEach(System.out::println);
    }*/

    }
}