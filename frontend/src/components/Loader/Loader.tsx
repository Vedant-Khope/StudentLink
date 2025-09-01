import classes from "./Loader.module.scss"
export default function Loader() {
  return (
    <div className={classes.root}>
      <img src="/StudentLinkLogo.png" alt="Loading..."/>
      <div className={classes.container}>
            <div className={classes.content}></div>
      </div>
    </div>
  );
}
