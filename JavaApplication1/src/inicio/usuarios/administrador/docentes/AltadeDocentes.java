/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inicio.usuarios.administrador.docentes;

import Conexion_base_de_datos.Conexion;
import inicio.usuarios.administrador.usuarios.Usuarios;
import inicio.usuarios.administrador.cuatrimestres.cuatrimestres;
import inicio.usuarios.administrador.docentes.Docentes;
import inicio.usuarios.administrador.horariosexternos.HorariosExternos;
import inicio.usuarios.administrador.generaciondehorarios.ConsultarHorariosDocente;
import inicio.usuarios.administrador.generaciondehorarios.ConsultarHorariosDocente;
import inicio.IngresaralSistema;
import inicio.usuarios.administrador.docentes.ConsultaDocentes;
import inicio.usuarios.administrador.usuarios.AltasUsuarios;
import inicio.usuarios.administrador.horariosalumnos.HorariosAlumnos;
import inicio.usuarios.administrador.asignarmaterias.AsignarAsignatura;
import inicio.usuarios.administrador.generaciondehorarios.PaginaPrincipalGeneraciondeHorarios;
import inicio.usuarios.administrador.docentes.AltadeDocentes;
import inicio.usuarios.administrador.docentes.BajaDocentes;
import inicio.usuarios.administrador.docentes.ModificarDocentes;
import inicio.usuarios.administrador.docentes.AltaDisponibilidadDocentes;
import inicio.usuarios.administrador.docentes.ModificarDisponibilidadDocentes;
import inicio.usuarios.administrador.docentes.BitacoraDocentes;


///para inportar ala base de datos
import Conexion_base_de_datos.Conexion;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;


/**
 *
 * @author BENJAMIN
 */
public class AltadeDocentes extends javax.swing.JFrame {

    /**
     * Creates new form INTERFAZ
     */
    public AltadeDocentes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cuatrimestre = new javax.swing.JButton();
        Docentes = new javax.swing.JButton();
        HorariosExternos = new javax.swing.JButton();
        HorariosAlumnos = new javax.swing.JButton();
        Usuarios = new javax.swing.JButton();
        GeneraciondeHorarios = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        SGH = new javax.swing.JLabel();
        LogoUnipoli = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        HorariosAlumnos1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nombrecompleto = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        especialidad = new javax.swing.JTextField();
        tentativas = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Cuatrimestre.setBackground(new java.awt.Color(255, 102, 0));
        Cuatrimestre.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Cuatrimestre.setText("Cuatrimestre");
        Cuatrimestre.setAlignmentX(0.1F);
        Cuatrimestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuatrimestreActionPerformed(evt);
            }
        });

        Docentes.setBackground(new java.awt.Color(255, 102, 0));
        Docentes.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Docentes.setText("Docentes");
        Docentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocentesActionPerformed(evt);
            }
        });

        HorariosExternos.setBackground(new java.awt.Color(255, 102, 0));
        HorariosExternos.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        HorariosExternos.setText("Horarios Externos");
        HorariosExternos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorariosExternosActionPerformed(evt);
            }
        });

        HorariosAlumnos.setBackground(new java.awt.Color(255, 102, 0));
        HorariosAlumnos.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        HorariosAlumnos.setText("Horarios Alumnos");
        HorariosAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorariosAlumnosActionPerformed(evt);
            }
        });

        Usuarios.setBackground(new java.awt.Color(255, 102, 0));
        Usuarios.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Usuarios.setText("Usuarios");
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });

        GeneraciondeHorarios.setBackground(new java.awt.Color(255, 102, 102));
        GeneraciondeHorarios.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        GeneraciondeHorarios.setText("Generación de Horarios");
        GeneraciondeHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneraciondeHorariosActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator3.setForeground(new java.awt.Color(255, 102, 0));

        SGH.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        SGH.setText("SISTEMA DE GESTIÓN DE HORARIOS");

        LogoUnipoli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.jpg"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton1.setText("Cerrar sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre del Usuario");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("Página Principal");

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(23767, 32767));
        jPanel2.setPreferredSize(new java.awt.Dimension(860, 25));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel3.setText("Universidad Politecnica de Durango, Area de Desarollo de Software");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(394, 394, 394))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        HorariosAlumnos1.setBackground(new java.awt.Color(255, 102, 0));
        HorariosAlumnos1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        HorariosAlumnos1.setText("Asignar Materias");
        HorariosAlumnos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorariosAlumnos1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton2.setText("Altas de Docentes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton3.setText("Baja de Docentes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton4.setText("Modificar Docentes");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton5.setText("Consultar de Docentes");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel4.setText("Docentes");

        jButton6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton6.setText("Alta de Disponibilidad");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton7.setText("Modificar Disponibilidad");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton8.setText("Bitacora de Modificaciones");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel5.setText("Nombre Completo");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel6.setText("Direccion");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel7.setText("Telefono");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel8.setText("Correo");

        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });

        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel9.setText("Perfil");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel10.setText("Carrera o Especialidad");

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel11.setText("Materias tentativas a inpartir");

        especialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadActionPerformed(evt);
            }
        });

        tentativas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tentativasActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton9.setText("Cancelar");

        jButton10.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton10.setText("Enviar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel12.setText("Altas Docentes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1299, Short.MAX_VALUE)
            .addComponent(jSeparator3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addGap(45, 45, 45)
                        .addComponent(jButton10)
                        .addGap(313, 313, 313))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(630, 630, 630))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(527, 527, 527))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(SGH, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(LogoUnipoli, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(Cuatrimestre)
                                .addGap(37, 37, 37)
                                .addComponent(Docentes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(HorariosExternos)
                                .addGap(52, 52, 52)
                                .addComponent(HorariosAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(HorariosAlumnos1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(GeneraciondeHorarios))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(329, 329, 329)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(224, 224, 224)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(direccion)
                                            .addComponent(telefono)
                                            .addComponent(especialidad)
                                            .addComponent(tentativas, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                                            .addComponent(correo)
                                            .addComponent(nombrecompleto))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(605, 605, 605))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LogoUnipoli, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jLabel1)))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SGH, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cuatrimestre)
                    .addComponent(Docentes)
                    .addComponent(HorariosExternos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HorariosAlumnos)
                    .addComponent(Usuarios)
                    .addComponent(GeneraciondeHorarios)
                    .addComponent(HorariosAlumnos1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel5)
                    .addComponent(nombrecompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addGap(0, 119, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tentativas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9)
                            .addComponent(jButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HorariosExternosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorariosExternosActionPerformed
        // Link para modulo horarios externos
        HorariosExternos obj=new HorariosExternos();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_HorariosExternosActionPerformed

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        // Link para modulo usuarios
        Usuarios obj=new Usuarios();
        obj.setVisible(true);
        dispose();


    }//GEN-LAST:event_UsuariosActionPerformed

    private void GeneraciondeHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneraciondeHorariosActionPerformed
        // Link para modulo usuarios
        PaginaPrincipalGeneraciondeHorarios obj=new PaginaPrincipalGeneraciondeHorarios();
        obj.setVisible(true);
        dispose();


    }//GEN-LAST:event_GeneraciondeHorariosActionPerformed

    private void CuatrimestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuatrimestreActionPerformed
        // Link para modulo cuatrimestres
        cuatrimestres obj=new cuatrimestres();
        obj.setVisible(true);
        dispose();


    }//GEN-LAST:event_CuatrimestreActionPerformed

    private void HorariosAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorariosAlumnosActionPerformed
        // Link para modulo horarios alumnos
        HorariosAlumnos obj=new HorariosAlumnos();
        obj.setVisible(true);
        dispose();


    }//GEN-LAST:event_HorariosAlumnosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Link para modulo cerrar sesion
        IngresaralSistema obj=new IngresaralSistema();
        obj.setVisible(true);
        dispose();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void HorariosAlumnos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorariosAlumnos1ActionPerformed
        // Link para modulo horarios alumnos
        AsignarAsignatura obj=new AsignarAsignatura();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_HorariosAlumnos1ActionPerformed

    private void DocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocentesActionPerformed
        // Link para modulo docentes
        Docentes obj=new Docentes();
        obj.setVisible(true);
        dispose();


    }//GEN-LAST:event_DocentesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Link para modulo alta docentes
       AltadeDocentes obj=new AltadeDocentes ();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Link para consultar docente
       ConsultaDocentes obj=new ConsultaDocentes();
        obj.setVisible(true);
        dispose();


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Link para modificar docentes
       ModificarDocentes obj=new ModificarDocentes();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Link para alta disponibilidad docente
       AltaDisponibilidadDocentes obj=new AltaDisponibilidadDocentes();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Link para modificar disponibilidad docentes
       ModificarDisponibilidadDocentes obj=new ModificarDisponibilidadDocentes ();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // Link para bitácora de modificaciones
       BitacoraDocentes obj=new BitacoraDocentes();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton8ActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void especialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especialidadActionPerformed

    private void tentativasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tentativasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tentativasActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Link para baja de docentes
       BajaDocentes obj=new BajaDocentes ();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
 Conexion con=new Conexion();
        Connection con2=con.conexion();
        //declarando 
        
        String sql;
        //declaro la variable error
        String mensajeerror;
        //usamos las variables anteriormente declaradas, para referenciales que equivalen a lo que se muestra en los campos de texto
                   
        sql="INSERT INTO asignatura(correo,direccion,especialidad,nombre_completo,telefono,tentativas)VALUES (?,?,?,?,?,?)";
        //le digo a la variable que hara la del error para luego ser llamada
        mensajeerror="Ingresa los datos correctamente";
        try {
            PreparedStatement pst=con2.prepareStatement(sql);
            //pst.setString(numero de campo,nombre de la caja de texto,gettext());
            pst.setString(1,nombrecompleto.getText());
            pst.setString(2,direccion.getText());
            pst.setString(3,telefono.getText());
            pst.setString(4,correo.getText());
            pst.setString(4,especialidad.getText());
            pst.setString(4,tentativas.getText());
            int n=pst.executeUpdate();
            if (n>=0){
                //son los mensajes de que se ejecuto correctamente la insercion
             JOptionPane.showMessageDialog(null,"registrado con exito en la base de datos");
                System.out.println("Guardado correctamente");
                    }
{
            
                        }
         }catch (Exception e){
             //lo puse de esta manera para mostrarle que no introdujo correctamente los datos
             JOptionPane.showMessageDialog(rootPane,mensajeerror);
             //este mensaje solo se imprimira en el registro--
             System.out.println("Ingresa los datos correctamente" + e);
             
        } 
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cuatrimestre;
    private javax.swing.JButton Docentes;
    private javax.swing.JButton GeneraciondeHorarios;
    private javax.swing.JButton HorariosAlumnos;
    private javax.swing.JButton HorariosAlumnos1;
    private javax.swing.JButton HorariosExternos;
    private javax.swing.JLabel LogoUnipoli;
    private javax.swing.JLabel SGH;
    private javax.swing.JButton Usuarios;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField especialidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nombrecompleto;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField tentativas;
    // End of variables declaration//GEN-END:variables
}
