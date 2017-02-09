using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();

		Console.WriteLine("27/10 = " + 27/10 + "resto = "+ 27%10 );

		//labelSaludo.Text = "Hola, pon tu nombre y pulsa Adelante";

		buttonGoForward.Clicked+= delegate {
		labelSaludo.Text = "Hola (desde delegate), pon tu nombre y pulsa Adelante";

		};

		Table table = new Table (9, 10, true);
		for (uint index = 0; index < 90; index++) {
			for (uint column = 0; column < 10; column++) {
				uint index = row*10 + column;
			Button button = new Button ();
			button.Label = "Botón " + index;
			button.Visible = true;
			table.Attach (button, vez, vez+1, 0, 1);
			button.Clicked += delegate {
				Console.WriteLine ("Clicked en" + button.Label);
			};
		}
		table.Visible = true;
		vBoxMain.Add (table);
	}
	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		//Console.WriteLine ("OnDeleteEvent");
		Application.Quit ();
		a.RetVal = true;
	}

	//protected void OnButtonGoForwardClicked (object sender, EventArgs e)
	//{
	//	Button button = (Button)sender;
	//	labelSaludo.Text = ("Hola " + entryNombre.Text + "pulsado" );
	//}
}
