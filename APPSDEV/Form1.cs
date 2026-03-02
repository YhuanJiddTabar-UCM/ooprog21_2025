using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Currency
{
    public partial class Form1 : Form
    {
        Dictionary<string, double> rates = new Dictionary<string, double>()
        {
            { "USD", 1.0 },
            { "PHP", 54.907 },
            { "EUR", 0.92 },
            { "CAD", 1.35 }
        };

        public Form1()
        {
            InitializeComponent();

            // Connect events (safe even if already connected)
            cb1.SelectedIndexChanged += cb1_SelectedIndexChanged;
            ConvertButton.Click += ConvertButton_Click;

            LoadCurrencies();
            UpdateSecondCombo(); // ensure cb2 loads on startup
        }

        private void LoadCurrencies()
        {
            cb1.Items.Clear();

            foreach (var currency in rates.Keys)
            {
                cb1.Items.Add(currency);
            }

            if (cb1.Items.Count > 0)
                cb1.SelectedIndex = 0;
        }

        private void UpdateSecondCombo()
        {
            if (cb1.SelectedItem == null) return;

            string selected = cb1.SelectedItem.ToString();

            cb2.Items.Clear();

            foreach (var currency in rates.Keys)
            {
                if (currency != selected)
                    cb2.Items.Add(currency);
            }

            if (cb2.Items.Count > 0)
                cb2.SelectedIndex = 0;
        }

        private void cb1_SelectedIndexChanged(object sender, EventArgs e)
        {
            UpdateSecondCombo();
        }

        private void ConvertButton_Click(object sender, EventArgs e)
        {
            if (!double.TryParse(tb1.Text, out double amount))
            {
                MessageBox.Show("Enter a valid number.");
                return;
            }

            if (cb1.SelectedItem == null || cb2.SelectedItem == null)
            {
                MessageBox.Show("Select currencies first.");
                return;
            }

            string from = cb1.SelectedItem.ToString();
            string to = cb2.SelectedItem.ToString();

            double amountInUSD = amount / rates[from];
            double converted = amountInUSD * rates[to];

            lb8.Text = amount.ToString("N2");
            lb9.Text = from;
            lb10.Text = to;
            lb11.Text = converted.ToString("N2") + " " + to;
        }

        private void groupBox3_Enter(object sender, EventArgs e)
        {
        }

        private void label2_Click(object sender, EventArgs e)
        {
        }

        private void label1_Click(object sender, EventArgs e)
        {
        }
    }
}