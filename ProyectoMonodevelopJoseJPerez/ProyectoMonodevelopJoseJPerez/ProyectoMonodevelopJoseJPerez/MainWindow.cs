using System;
using Gtk;
using System.IO;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}

	protected void OnLanzarButtonPressEvent (object o, ButtonPressEventArgs args)
	{
		return r1 text
	}


	
}
