package ui.swing;

import javax.swing.*;
import java.awt.*;

public class TelaConta extends JFrame {

    private static final Color CAIXA_BLUE = new Color(0, 91, 165);
    private static final Color DARK_BLUE = new Color(0, 67, 125);

    public TelaConta() {

        setTitle("CAIXA - Auto-Atendimento");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(600, 450);

        setLocationRelativeTo(null);

        setResizable(false);

        setContentPane(new PainelCaixa());
    }

    // Painel responsável pelo desenho da interface
    private class PainelCaixa extends JPanel {

        public PainelCaixa() {
            setLayout(null);

            criarBotoes();
        }

        private void criarBotoes() {

            // =========================
            // COLUNA ESQUERDA
            // =========================

            criarBotao(
                    "DEPÓSITOS",
                    39, 135, 233, 42,
                    false
            );

            criarBotao(
                    "<html>PAGAMENTOS<br>E AGENDAMENTOS</html>",
                    39, 212, 233, 42,
                    false
            );

            criarBotao(
                    "INVESTIMENTOS",
                    39, 290, 233, 42,
                    false
            );

            criarBotao(
                    "TRANSFERÊNCIAS",
                    39, 367, 233, 42,
                    false
            );


            // =========================
            // COLUNA DIREITA
            // =========================

            criarBotao(
                    "SAQUES",
                    343, 135, 233, 42,
                    true
            );

            criarBotao(
                    "SALDOS E EXTRATOS",
                    343, 212, 233, 42,
                    true
            );

            criarBotao(
                    "<html>EMPRÉSTIMOS, CDC, CHEQUE<br>"
                            + "ESPECIAL E CONSIGNAÇÃO</html>",
                    343, 290, 233, 42,
                    true
            );

            criarBotao(
                    "OUTROS SERVIÇOS",
                    343, 367, 233, 42,
                    true
            );
        }


        private void criarBotao(
                String texto,
                int x,
                int y,
                int largura,
                int altura,
                boolean setaDireita) {

            JButton botao = new JButton(texto);

            botao.setBounds(x, y, largura, altura);

            botao.setFont(
                    new Font("Arial", Font.BOLD, 11)
            );

            botao.setForeground(DARK_BLUE);

            botao.setFocusPainted(false);

            botao.setCursor(
                    new Cursor(Cursor.HAND_CURSOR)
            );

            botao.setBackground(Color.WHITE);

            botao.setBorder(
                    BorderFactory.createLineBorder(
                            new Color(200, 200, 200)
                    )
            );

            if (setaDireita) {

                botao.setHorizontalTextPosition(
                        SwingConstants.CENTER
                );

                botao.setText(texto + "     >");

            } else {

                botao.setText("<     " + texto);
            }

            // Evento do botão
            botao.addActionListener(e -> {

                System.out.println(
                        "Opção selecionada: " + texto
                );

            });

            add(botao);
        }


        @Override
        protected void paintComponent(Graphics g) {

            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g.create();

            g2.setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON
            );


            // =========================
            // FUNDO DA TELA
            // =========================

            g2.setColor(CAIXA_BLUE);

            g2.fillRect(
                    27,
                    31,
                    554,
                    407
            );


            // =========================
            // CABEÇALHO
            // =========================

            GradientPaint gradiente =
                    new GradientPaint(
                            0,
                            39,
                            Color.WHITE,
                            0,
                            94,
                            new Color(220, 220, 220)
                    );

            g2.setPaint(gradiente);

            g2.fillRoundRect(
                    39,
                    39,
                    537,
                    55,
                    14,
                    14
            );


            // =========================
            // LOGO
            // =========================

            g2.setFont(
                    new Font(
                            "Arial",
                            Font.BOLD | Font.ITALIC,
                            31
                    )
            );

            g2.setColor(
                    new Color(0, 126, 197)
            );

            g2.drawString(
                    "CAIXA",
                    61,
                    76
            );


            // Detalhe amarelo
            g2.setColor(
                    new Color(244, 180, 0)
            );

            g2.setStroke(
                    new BasicStroke(3)
            );

            g2.drawLine(
                    113,
                    80,
                    127,
                    80
            );


            // =========================
            // TEXTO DO CABEÇALHO
            // =========================

            g2.setColor(DARK_BLUE);

            g2.setFont(
                    new Font(
                            "Arial",
                            Font.BOLD,
                            10
                    )
            );

            g2.drawString(
                    "AUTO-ATENDIMENTO",
                    234,
                    57
            );

            g2.setFont(
                    new Font(
                            "Arial",
                            Font.BOLD,
                            8
                    )
            );

            g2.drawString(
                    "POR FAVOR, PRESSIONE O BOTÃO AO LADO DA OPÇÃO DESEJADA",
                    234,
                    70
            );


            // =========================
            // ELEMENTOS DO FUNDO
            // =========================

            g2.setColor(
                    new Color(15, 112, 190)
            );

            g2.fillOval(
                    155,
                    239,
                    310,
                    155
            );

            g2.setColor(
                    new Color(35, 132, 204)
            );

            g2.fillOval(
                    285,
                    220,
                    245,
                    125
            );


            // =========================
            // CÍRCULO CENTRAL
            // =========================

            g2.setColor(
                    new Color(215, 224, 228)
            );

            g2.fillOval(
                    293,
                    251,
                    28,
                    28
            );

            g2.setColor(
                    new Color(170, 184, 190)
            );

            g2.drawOval(
                    293,
                    251,
                    28,
                    28
            );


            g2.dispose();
        }
    }
}