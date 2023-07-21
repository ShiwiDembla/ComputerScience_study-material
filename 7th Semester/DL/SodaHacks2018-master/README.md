# SodaHacks2018

For our SodaHacks 2018 project, we created a Django app that allows users to input long text blobs and receive summaries of a specified length.

![](./TestSummarizer.png?raw=true)

## Getting Started

We spent MANY hours trying to get a Heroku demo app running, but there seems to be too many issues with it. We apologize for the inconvenience. These instructions will get you a copy of the project up and running on your local machine for testing purposes. To start with, pull the repo to your local machine.

### Installing Dependencies

```bash
pip install algorithmia
pip install django
```

### Running the app

From the folder where manage.py is located, run the following:

```bash
python manage.py migrate
python manage.py runserver
```

Navigate to http://127.0.0.1:8000/ to use the app.

#### Here is some text to try the algorithm out with:

[Source](https://www.bloomberg.com/view/articles/2018-03-23/robots-won-t-take-all-jobs-because-humans-demand-new-things)

Predicting the course of technological progress is extremely difficult. Just because worries about human obsolescence ultimately turned out to be misplaced in the Industrial Revolution doesn’t mean that the same happy result must necessarily prevail this time around. So the persistent question about artificial intelligence -- or “robots” in common parlance – is whether they will make human workers obsolete. Recent rapid progress in machine learning -- a very powerful and flexible statistical prediction technique -- has raised worries that machines will soon be able to outperform humans at any conceivable task. Already, occupations that employ very large numbers of Americans, such as commercial trucking, are under threat. Workers displaced by machine learning may be able to find new, even more valuable things to do, as happened when industrial technology displaced craft manufacturers over a century ago, or they may not -- and even if they do, getting there may involve a long and bumpy road. It’s a rich topic, as I was reminded this week at a Bloomberg Ideas conference, where I sat on a panel discussing the economics of artificial intelligence. With all this uncertainty and fear, economists are naturally scrambling to look for evidence on the effects of recent waves of automation. So far, the best known study seems to be a 2017 paper by Daron Acemoglu and Pascual Restrepo of MIT. Acemoglu and Restrepo find that between 1990 and 2007, places with more robots lost more jobs and saw lower wages. Much of the press has picked up on this study, and taken it as evidence that automation really is bad for workers. But there are big caveats to Acemoglu and Restrepo’s paper. The kind of robots they look at constitute only a small fraction of the automation technologies being deployed across the world today. Economists from the Economic Policy Institute looked closely at Acemoglu and Restrepo’s results and found that investment in computers is associated with job gains rather than losses. An accurate picture requires a very general definition of automation. Economists Katja Mann and Lukas Puttmann of the University of Bonn have a new paper in which they observe the march of automation-related technology by looking at patent records. The authors use text algorithms to classify patents into automation patents and others, using their broad definition of “a device that carries out a process independently.” This includes things like automated taco machines and hair dye applicators, but not hand-held scanners. It’s not clear that this is the best way of defining automation -- after all, using a hand-held scanner could involve only a little more human input than pressing the button to start an automated taco machine. But since there’s no unique and satisfying definition of automation, Mann and Puttmann’s method is probably as good as most. They find, unsurprisingly, that the share of patents related to automation has climbed steeply -- from 25 percent in 1976 to 67 percent in 2014. The authors report that this increase in automation technology has not led to the loss of jobs overall -- in fact, probably the opposite. By linking patents with industries and industries with locations, they purport to measure the statistical effect of automation patents on local employment. They find that over a five-year period, automation patents routinely led to an increase in total employment as a percent of population. Assuming Mann and Puttmann have defined automation right, correctly linked it to specific locations, and chosen the right time period over which to study the impact, this means that automation is creating jobs. That could be because humans continue to find new tasks to perform in order to complement new machines, or it could be because automation leads to a boom that increases local labor demand. Either way, this research represents an important counterpoint to Acemoglu and Restrepo’s paper. There is one caveat, though -- Mann and Puttmann find that automation is associated with job loss in the manufacturing industry. Even as productivity in manufacturing has risen, demand for manufactured goods has not kept pace -- hence, workers in that industry have been replaced rather than complemented. A paper by economist James Bessen argues that this is a universal pattern. When an industry is young, automation doesn’t displace workers, because people keep buying more and more of that industry’s products. But when people eventually have enough of something -- couches, televisions, etc. -- automation can no longer increase an industry’s aggregate size, and starts displacing workers instead. This model implies that as long as we keep inventing new products and services, automation isn’t going to make humanity obsolete. Only if the human race runs out of new desires will the robots take our jobs. So far, that shows no signs of happening. The prospect of automation threatening human usefulness remains firmly in the realm of science fiction.

#### With a specified output length of 5 sentences, the app returns:

So the persistent question about artificial intelligence -- or robots in common parlance is whether they will make human workers obsolete. Recent rapid progress in machine learning -- a very powerful and flexible statistical prediction technique -- has raised worries that machines will soon be able to outperform humans at any conceivable task. Workers displaced by machine learning may be able to find new, even more valuable things to do, as happened when industrial technology displaced craft manufacturers over a century ago, or they may not -- and even if they do, getting there may involve a long and bumpy road. With all this uncertainty and fear, economists are naturally scrambling to look for evidence on the effects of recent waves of automation. The authors use text algorithms to classify patents into automation patents and others, using their broad definition of a device that carries out a process independently.

#### NOT BAD RIGHT?!?!?

## Built With

* Algoritmia
* Django
* Bootstrap

## Authors

Avneesh Mehta and Shaurya Sanghvi

## Acknowledgments

* All of the YouTube vids and online tutorials out there that taught us Django
* [This](https://gist.github.com/PurpleBooth/109311bb0361f32d87a2) README template
* My serious desire to never read a long paper EVER again
