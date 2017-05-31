using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	private int[] resultado = {0, 0, 0};
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
//		label1.Text = "0";
//		label2.Text = "0";
//		label3.Text = "0";
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}

	protected void OnDado1Clicked (object sender, EventArgs e)
	{
		Random rnd = new Random ();
		int ran1 = rnd.Next (1, 6);
		resultado [0] = ran1;

		string s1 = Convert.ToString (ran1);

		label1.Text = (s1);	

		refreshTotal ();
	}

	protected void OnDado2Clicked (object sender, EventArgs e)
	{
		Random rnd = new Random ();
		int ran2 = rnd.Next (1, 12);
		resultado [1] = ran2;
		string s2 = Convert.ToString (ran2);

		label2.Text = (s2);	
		refreshTotal ();

	}

	protected void OnDado3Clicked (object sender, EventArgs e)
	{
		Random rnd = new Random ();
		int ran2 = rnd.Next (1, 20);
		resultado [2] = ran2;

		string s2 = Convert.ToString (ran2);

		label3.Text = (s2);	
		refreshTotal ();
	}

	private void refreshTotal() {
//		int n1 = int.Parse (label1.Text);
//		int n2 = int.Parse (label2.Text);
//		int n3 = int.Parse (label3.Text);
//		total.Text = (n1 + n2 + n3).ToString ();
		int suma = 0;
		foreach (int valor in resultado)
			suma += valor;
		total.Text = suma.ToString ();
	}

}
