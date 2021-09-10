package br.com.pilgriman;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {

    // 1 - Consulta
    public List<Professor> list() {
        // Preparar lista que irá retornar professores após consultar o banco de dados;
        List<Professor> professores = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection()) {
            // Preparar consulta SQL.
            String sql = "SELECT * FROM professor";

            // Preparar statement com os parâmetros recebidos (nesta função não tem
            // parâmetros, pois irá retornar todos os valores da tabela professor)
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Executa consulta e armazena o retorno da consulta no objeto "rs".
            ResultSet rs = stmt.executeQuery();

            // Criar um objeto professor e guardar na lista de professores.
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int idade = rs.getInt("idade");
                String estado = rs.getString("estado");

                professores.add(new Professor(id, nome, idade, estado));
            }
        } catch (SQLException e) {
            System.out.println("Listagem de professores FALHOU!");
            e.printStackTrace();
        }

        // Retornar todos os professores encontrados no banco de dados.
        return  professores;
    }

    // 1.1 - Consulta com filtro
  //  public Professor getById(int id) {
        // Preparar objeto professor para receber os valores do banco de dados.
        //Professor professor = new Professor();

        //try (Connection conn = ConnectionFactory.getConnection()) {
            // Preparar consulta SQL
            //String sql = "SELECT * FROM professor WHERE id = ?";

            // Preparar statement com os parâmetros recebidos
           // PreparedStatement stmt = conn.prepareStatement(sql);
           // stmt.setInt(1, id);

            // Executa consulta e armazena o retorno da consulta no objeto "rs".
           // ResultSet rs = stmt.executeQuery();

            // Guardar valores retornados da tabela professor no objeto aluno
          //  if (rs.next()) {
                //professor.setId(rs.getInt("id"));
                //professor.setNome(rs.getString("nome"));
    //professor.setIdade(rs.getInt("idade"));
    // professor.setEstado(rs.getString("estado"));
           // }

// } catch (SQLException e) {
// System.out.println("Listagem de professores FALHOU!");
// e.printStackTrace();
// }

        // Retorna professor encontrado no banco de dados.
//return professor;
    //}

    // 2 - Inserção
//public void create(Professor professor) {
    //   try (Connection conn = ConnectionFactory.getConnection()) {

            // Preparar SQL para inserção de dados do professor.
            //String sql = "INSERT INTO professor(nome, idade, estado) VALUES(?, ?, ?)";

            // Preparar statement com os parâmetros recebidos
// PreparedStatement stmt = conn.prepareStatement(sql);
//  stmt.setString(1, professor.getNome());
//  stmt.setInt(2, professor.getIdade());
    //  stmt.setString(3, professor.getEstado());

            // Executa inserção e armazena o numero de linhas afetadas
// int rowsAffected = stmt.executeUpdate();

    // System.out.println("Inserção BEM SUCEDIDA!. Foi adicionada " + rowsAffected + " linha");
//} catch (SQLException e) {
//    System.out.println("Inserção FALHOU!");
    //   e.printStackTrace();
    //    }
    // }

    // 3 - Delete
   /* public void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection()) {

            // Preparar SQL para deletar uma linha.
            String sql = "DELETE FROM professor WHERE id = ?";

            // Preparar statement com os parâmetros recebidos
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            // Executa delete e armazena o numero de linhas afetadas
            int rowsAffected = stmt.executeUpdate();

            System.out.println("Delete BEM SUCEDIDA! Foi deletada " + rowsAffected + " linha");
        } catch (SQLException e) {
            System.out.println("Delete FALHOU!");
            e.printStackTrace();
        }
    }

    // 4 - Atualizar
    public void update(Professor professor) {
        try (Connection conn = ConnectionFactory.getConnection()) {

            // Preparar SQL para atualizar linhas.
            String sql = "UPDATE professor SET nome = ?, idade = ?, estado = ? WHERE id = ?";

            // Preparar statement com os parâmetros recebidos
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, professor.getNome());
            stmt.setInt(2, professor.getIdade());
            stmt.setString(3, professor.getEstado());
            stmt.setInt(4, professor.getId());

            // Executa atualização e armazena o numero de linhas afetadas
            int rowsAffected = stmt.executeUpdate();

            System.out.println("Atualização BEM SUCEDIDA! Foi atualizada: " + rowsAffected + " linha");
        } catch (SQLException e) {
            System.out.println("Atualização FALHOU!");
            e.printStackTrace();
        }
    }*/

}