package segundo_punto;

public class Segundo_Punto {
    
    public static void main(String[] args) {
        
    VentanaPrincipal ventana = new VentanaPrincipal();
    ventana.setVisible(true);
    
   }
}
public class Circulo {
    int radio;
    Circulo(int radio){
        this.radio=radio;
    }
    double calcularArea() {
        return Math.PI*Math.pow(radio, 2);
    }
    double calcularPerimetro() {
        return 2*Math.PI*radio;
    }

}
public class Cuadrado {
    int lado;
    public Cuadrado(int lado) {
    this.lado=lado;
}
    double calcularArea() {
        return lado*lado;
    }
    double calcularPerimetro() {

        return (4*lado);

    }

}
public class Rectangulo {
	int base,altura;
	Rectangulo(int base, int altura){
	this.base=base;
	this.altura=altura;
	}
	double calcularArea() {
	return base*altura;
	}
	double calcularPerimetro() {
	return (2*base)+(2*altura);
	}

}
public class Rombo {
	double Lado,DiagonalM,DiagonalI;
	Rombo(double Lado, double DiagonalM,double DiagonalI){
	this.Lado=Lado;
	this.DiagonalM=DiagonalM;
	this.DiagonalI=DiagonalI;
	}
	double calcularArea() {
	return (DiagonalM*DiagonalI)/2;
	}
	double calcularPerimetro() {
	return 4*Lado;
	}
	
}
public class Trapecio {
	double BaseM,BaseI,altura;
	Trapecio(double BaseM, double BaseI,double altura){
	this.BaseM=BaseM;
	this.BaseI=BaseI;
	this.altura=altura;
	}
	double calcularArea() {
	return ((BaseM+BaseI)*altura)/2;
	}
	double calcularPerimetro() {
	double lado=(BaseM-BaseI)/2;
	double Raiz=(altura*altura)+(lado*lado);
	double Hipotenusa= Math.sqrt(Raiz);
	return  BaseM+BaseI+(2*Hipotenusa);
	}
	
}
import javax.swing.JOptionPane;

public class TrianguloRectangulo {
	int base,altura;
	public TrianguloRectangulo(int base,int altura) {
	this.base=base;
	this.altura=altura;
	}
	double calcularArea() {
	return (base*altura/2);
	}
	double calcularPerimetro() {
	return (base+altura+calcularHipotenusa());
	}
	double calcularHipotenusa() {
	return Math.pow(base*base+altura*altura, 0.5);
	}
	void determinarTipoTriangulo() {
	if((base==altura)&&(base==calcularHipotenusa())&&(altura==calcularHipotenusa())
	)
	JOptionPane.showMessageDialog(null, "Es un triangulo equilatero");
	
	else if(((base != altura) && (base != calcularHipotenusa()) && (altura != 
	calcularHipotenusa())))
	JOptionPane.showMessageDialog(null, "Es un triangulo escaleno");
	else
	JOptionPane.showMessageDialog(null, "Es un triangulo isosceles");
	}
	}
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JButton;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	JButton btnTriangulo;
	JButton btnCirculo;
	JButton btnCuadrado;
	JButton btnRectangulo ;
	JButton btnRombo;
	JButton btnTrapecio;
	


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iniciarComponentes();	
		setLocationRelativeTo(null);
		setTitle("figuras geometricas");
		setResizable(false);
		

	}

	private void iniciarComponentes() {
		setBounds(100, 100, 489, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCirculo = new JButton("Circulo");
		btnCirculo.addActionListener(this);
		btnCirculo.setBounds(26, 36, 169, 69);
		contentPane.add(btnCirculo);
		
		btnCuadrado = new JButton("Cuadrado");
		btnCuadrado.addActionListener(this);
		
		btnCuadrado.setBounds(215, 36, 153, 69);
		contentPane.add(btnCuadrado);
		
		btnRectangulo = new JButton("Rectangulo");
		btnRectangulo.addActionListener(this);
		btnRectangulo.setBounds(26, 116, 169, 79);
		contentPane.add(btnRectangulo);
		
		btnTriangulo = new JButton("Triangulo");
		btnTriangulo.addActionListener(this);
		btnTriangulo.setBounds(215, 116, 156, 79);
		contentPane.add(btnTriangulo);
		
		btnRombo = new JButton("Rombo");
		btnRombo.addActionListener(this);
		btnRombo.setBounds(26, 199, 169, 80);
		contentPane.add(btnRombo);
		
		btnTrapecio = new JButton("Trapecio");
		btnTrapecio.addActionListener(this);
		btnTrapecio.setBounds(215, 199, 156, 80);
		contentPane.add(btnTrapecio);
		
		JLabel lblNewLabel = new JLabel("Digite enteros");
		lblNewLabel.setBounds(106, 11, 304, 14);
		contentPane.add(lblNewLabel);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnCirculo==e.getSource()) {
			int radio=Integer.parseInt(JOptionPane.showInputDialog("introduce el radio"));
			Circulo figura1= new Circulo (radio);
			JOptionPane.showMessageDialog(null, "El area del circulo es= "+figura1.calcularArea());
			JOptionPane.showMessageDialog(null, "El perimetro  del circulo es= "+figura1.calcularPerimetro());	
		}
		if (btnCuadrado==e.getSource()) {
			int Lado=Integer.parseInt(JOptionPane.showInputDialog("introduce longitud de un lado"));
			Cuadrado figura2=new Cuadrado(Lado);
			JOptionPane.showMessageDialog(null, "El area del Cuadrado es= "+figura2.calcularArea());
			JOptionPane.showMessageDialog(null, "El perimetro  del Cuadrado es= "+figura2.calcularPerimetro());
		
		
	}
		if (btnRectangulo==e.getSource()) {
			int Base=Integer.parseInt(JOptionPane.showInputDialog("introduce longitud de un Base"));
			int Altura=Integer.parseInt(JOptionPane.showInputDialog("introduce longitud de un Altura"));
			
			Rectangulo figura3= new Rectangulo(Base,Altura);
			JOptionPane.showMessageDialog(null, "El area del Rectangulo es= "+figura3.calcularArea());
			JOptionPane.showMessageDialog(null, "El perimetro  del Rectangulo es= "+figura3.calcularPerimetro());
		
		
	}
		if (btnTriangulo==e.getSource()) {
			int Base=Integer.parseInt(JOptionPane.showInputDialog("introduce longitud de un Base"));
			int Altura=Integer.parseInt(JOptionPane.showInputDialog("introduce longitud de un Altura"));
			
			TrianguloRectangulo figura4 =new TrianguloRectangulo(Base,Altura);
			JOptionPane.showMessageDialog(null, "El area del Triangulo es es= "+figura4.calcularArea());
			JOptionPane.showMessageDialog(null, "El perimetro  del Triangulo es= "+figura4.calcularPerimetro());
			figura4.determinarTipoTriangulo();
}
		if (btnRombo==e.getSource()) {
			double Lado=Integer.parseInt(JOptionPane.showInputDialog("introduce longitud de un lado"));
			double DiagonalM=Integer.parseInt(JOptionPane.showInputDialog("introduce longitud de la diagonal mayor"));
			double DiagonalI=Integer.parseInt(JOptionPane.showInputDialog("introduce longitud de la diagonal menor"));
			Rombo figura5= new Rombo(Lado,DiagonalM,DiagonalI);
			JOptionPane.showMessageDialog(null, "El area del Rombo es= "+figura5.calcularArea());
			JOptionPane.showMessageDialog(null, "El perimetro  del Rombo es= "+figura5.calcularPerimetro());
			
			
		}
		if (btnTrapecio==e.getSource()) {
			double BaseM=Integer.parseInt(JOptionPane.showInputDialog("introduce longitud de la base mayor"));
			double BaseI=Integer.parseInt(JOptionPane.showInputDialog("introduce longitud de la base menor"));
			double altura=Integer.parseInt(JOptionPane.showInputDialog("introduce longitud de la altura"));
			
			Trapecio figura6= new Trapecio(BaseM,BaseI,altura);
			JOptionPane.showMessageDialog(null, "El area del Trapecio es= "+figura6.calcularArea());
			JOptionPane.showMessageDialog(null, "El perimetro  del Trapecio es= "+figura6.calcularPerimetro());
			}
		}
	}
