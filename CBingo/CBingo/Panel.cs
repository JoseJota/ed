using Gtk;
using System;
using System.Collections.Generic;

namespace CBingo
{
	public class Panel
	{
		public Panel ()
		{
			private const int NUMERO_BOLAS = 90;
			private const readonly Gdk.Color COLOR_GREEN = new Gdk.ColorButton (0,255,0);
			private IList<Button> buttons = new List<Button>();
			private Table table = new Table (9, 10, true);
			public Panel() {
				for (int index = 0; index < 90; index++) {
					Button button = new Button ();
					int numero = index + 1;
					button.Label = numero.ToString ();
					uint row = (uint)index % 10;
					uint column = (uint)index % 10;
					table.Attach (button, column, column + 1, row, row + 1);
					buttons.Add (button);
				}

				table.Visible = true;

			}
			public void MarcarNumero(int numero) {
				ButtonsType[numero - 1].ModifyBg(StateType.Normal, COLOR_GREEN);
		}
	}
}