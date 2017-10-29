package kata4.view;

import kata4.model.Histogram;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import java.awt.Dimension;


    public class HistogramDisplay extends ApplicationFrame {

        Histogram<String> histogram=new Histogram();

        public HistogramDisplay(Histogram<String> histogram) {
            super("Kata3: Histograma");
            this.histogram = histogram;
            setContentPane(createPanel());
            pack();

        }

        public void execute(){
            setVisible(true);
        }

        private ChartPanel createPanel(){
            ChartPanel chartPanel =new ChartPanel(createChart(createDataset()));
            chartPanel.setPreferredSize(new Dimension(500,400));
            return chartPanel;
        }

        private JFreeChart createChart(DefaultCategoryDataset dataSet){
            JFreeChart chart=
                    ChartFactory.createBarChart("JFreeChart",
                            "Dominios email",
                            "Nº email",
                            dataSet,
                            PlotOrientation.VERTICAL,
                            false,
                            true,
                            rootPaneCheckingEnabled);
            return chart;
        }

        private DefaultCategoryDataset createDataset(){
            DefaultCategoryDataset dataSet=new DefaultCategoryDataset();
            for (String key : histogram.keySet()) {
                dataSet.addValue(histogram.get(key),"",key);
            }

            return dataSet;
        }

    }
