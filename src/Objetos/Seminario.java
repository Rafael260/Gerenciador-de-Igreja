package Objetos;
// Generated 03/06/2016 10:35:37 by Hibernate Tools 4.3.1


import Util.FormatoDataHora;
import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 * Seminario generated by hbm2java
 */
public class Seminario  implements java.io.Serializable {

     private String nome;
     private Membro membro;
     private Set disciplinas = new HashSet(0);

    public Seminario() {
    }

	
    public Seminario(String nome, Membro membro) {
        this.nome = nome;
        this.membro = membro;
    }
    public Seminario(String nome, Membro membro, Set disciplinas, Set periodoLetivos) {
       this.nome = nome;
       this.membro = membro;
       this.disciplinas = disciplinas;
    }
   
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Membro getMembro() {
        return this.membro;
    }
    
    public void setMembro(Membro membro) {
        this.membro = membro;
    }
    
 //   @OneToMany(fetch = FetchType.EAGER) 
    public Set getDisciplinas() {
        return this.disciplinas;
    }
    
    public void setDisciplinas(Set disciplinas) {
        this.disciplinas = disciplinas;
    }

    ////////////////////////////////////////////////////

    public static Seminario preencherDadosSeminario(Object[] object, int index){
        Seminario seminario = new Seminario();
        seminario.setNome((String)object[index]);
        return seminario;
    }
    
    /*public static Seminario selectSeminarioPk(String nome){
        Seminario seminario = new Seminario();
        seminario.setNome(nome);
        List objects = HibernateUtil.getTuplasPorExemplo(seminario, Seminario.class);
        return (Seminario)objects.get(0);
    }*/
    
    /*public static Seminario selectSeminarioPk(String nome){
        List<Object[]> objects = HibernateUtil.getTuplasDaTabela("(pessoa natural join membro) join seminario s on id = id_coordenador", "s.nome = '"+nome+"'", "", 0);
        Membro coordenador = Membro.preencherDadosMembro(objects.get(0), 0);
        Seminario seminario = preencherDadosSeminario(objects.get(0), 21);
        seminario.setMembro(coordenador);
        return seminario;
    }*/
    
    public static Seminario selectSeminarioPk(String nome){
        List<Object[]> objects = HibernateUtil.rodarSQL("select p.id, p.nome AS p_nome, p.sobrenome, p.telefone, p.end_rua, p.end_numero, p.end_comp , p.end_bairro, p.end_cidade, p.end_estado, p.email, p.estado_civil, m.cpf, m.data_nasc, m.batismo_apres, m.usuario, m.senha, m.permissoes, m.id_lider, m.hora_grupo, m.dia_sem_grupo, s.nome AS s_nome, s.id_coordenador\n" +
"	from pessoa p, membro m, seminario s\n" +
"    where p.id= m.id and s.nome = '"+nome+"' and p.id=s.id_coordenador\n");
        Membro membro = Membro.preencherDadosMembro(objects.get(0), 0);
        Seminario seminario = preencherDadosSeminario(objects.get(0), 21);
        seminario.setMembro(membro);
        return seminario;
    }
    
    //Geralmente só vai ter um
    public static List<Seminario> listarTodos(){
        return HibernateUtil.getTuplasDaTabela("Seminario");
    }
    
    public List<Disciplina> selectDisciplinas(){
        Disciplina disciplina = new Disciplina();
        disciplina.setSeminario(this);
        return HibernateUtil.getTuplasPorExemplo(disciplina, Disciplina.class);
    }
    
    public List<Turma> selectDisciplinasAtivas(){
        Date dataAtual = FormatoDataHora.getDataHoraAtual();
        List<Turma> turmas = new ArrayList();
        Disciplina disciplina;
        Turma turma;
        List<Object[]> objects = HibernateUtil.rodarSQL("select *\n" +
"	from disciplina d join turma t on d.codigo=t.cod_disc\n" +
"    where '"+FormatoDataHora.sqlData(dataAtual)+"+' between t.data_inicio and t.data_fim");
        for (Object[] object : objects) {
            disciplina = Disciplina.preencherDadosDisciplina(object, 0);
            turma = Turma.preencherDadosTurma(object, 3);
            turma.setDisciplina(disciplina);
            turmas.add(turma);
        }
        return turmas;
    }
}


