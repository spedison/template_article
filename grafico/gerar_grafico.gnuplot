set terminal jpeg size 800,600
set output 'grafico.jpg'
set datafile separator ","
set title "Gráfico de Seno"
set xlabel "Tempo (s)"
set ylabel "Valor"
plot 'dados.csv' using 1:2 with lines title "sin(t)"

